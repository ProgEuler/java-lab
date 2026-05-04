public final class SystemConfig {
   private static final int MAX_USERS = 500;

   private SystemConfig() {}

   public static int getMaxUsers() {
      return MAX_USERS;
   }
}
