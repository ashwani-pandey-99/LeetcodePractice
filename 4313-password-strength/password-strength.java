class Solution {
    public int passwordStrength(String password) {
        boolean[] seen = new boolean[128];
        int ans = 0;

        for (char c : password.toCharArray()) {
            if (seen[c]) continue;
            seen[c] = true;

            if (Character.isLowerCase(c)) ans += 1;
            else if (Character.isUpperCase(c)) ans += 2;
            else if (Character.isDigit(c)) ans += 3;
            else ans += 5;
        }

        return ans;
    }
}