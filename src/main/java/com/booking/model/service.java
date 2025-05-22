package BookingManagement.BookingManagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BookingService {

    // Ensure file exists and is writable
    private void ensureFileExists(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            Files.createDirectories(Paths.get(file.getParent()));
            file.createNewFile();
        }
        if (!file.canWrite()) {
            throw new IOException("File is not writable: " + filePath);
        }
    }

    // Method to save booking to a file
    public boolean saveBooking(Booking booking, String filePath) {
        if (booking == null || filePath == null || filePath.isEmpty()) {
            return false;
        }

        try {
            ensureFileExists(filePath);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.write(booking.getBookingID() + "," +
                        booking.getCustomerName() + "," +
                        booking.getBookingDate().toString() + "," +
                        booking.getStatus());
                writer.newLine();
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}