
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example, Given s = "Hello World", return 5.
 */
 class LengthofLastWord {
 	fun lengthOfLastWord(s: String): Int {
 		var n = s.length - 1
 		if (n == -1)
 			return 0
 		while (n >= 0 && s[n] == ' ')
 			n--
 		val size = n + 1
 		while (n >= 0) {
 			if (s[n] == ' ')
 				return size - n - 1
 			n--
 		}
 		return size
 	}
 }
