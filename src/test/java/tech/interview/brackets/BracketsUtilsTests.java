package tech.interview.brackets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class BracketsUtilsTests {

	@Test
	void contextLoads() {
		/**
		 * Example 1: Input: "()" Output: true
		 */
		String example = "()";
		Assert.isTrue(BracketsUtils.hasValidBrackets(example), "Example 1: Input: \"" + example + "\" Output: true");

		/**
		 * Example 2: Input: "()[]{}" Output: true
		 */
		example = "()[]{}";
		Assert.isTrue(BracketsUtils.hasValidBrackets(example), "Example 2: Input: \"" + example + "\" Output: true");

		/**
		 * Example 3: Input: "(]" Output: false
		 */
		example = "(]";
		Assert.isTrue(!BracketsUtils.hasValidBrackets(example), "Example 3: Input: \"" + example + "\" Output: fasle");
		/**
		 * Example 4: Input: "([)]" Output: false
		 * 
		 */
		example = "([)]";
		Assert.isTrue(!BracketsUtils.hasValidBrackets(example), "Example 4: Input: \"" + example + "\" Output: false");
		/**
		 * Example 5: Input: "{[]}" Output: true
		 */
		example = "{[]}";
		Assert.isTrue(BracketsUtils.hasValidBrackets(example), "Example 5: Input: \"" + example + "\" Output: true");
		/**
		 * Example 6: Input: "" Output: true
		 */
		example = "";
		Assert.isTrue(BracketsUtils.hasValidBrackets(example), "Example 6: Input: \"" + example + "\" Output: true");
		/**
		 * Example 7: Input: "   " Output: true
		 */
		example = "   ";
		Assert.isTrue(BracketsUtils.hasValidBrackets(example), "Example 7: Input: \"" + example + "\" Output: true");
		/**
		 * Example 8: Input: null Output: true
		 */
		example = null;
		Assert.isTrue(BracketsUtils.hasValidBrackets(example), "Example 8: Input: \"null\" Output: true");
		/**
		 * Example 9: Input: "{[]}" Output: true
		 */
		example = "{abc[def]hij]qwer}";
		Assert.isTrue(!BracketsUtils.hasValidBrackets(example), "Example 9: Input: \"" + example + "\" Output: false");
		/**
		 * Example 10: Input: "{" Output: true
		 */
		example = "{";
		Assert.isTrue(!BracketsUtils.hasValidBrackets(example), "Example 10: Input: \"" + example + "\" Output: false");
	}

	@Test
	void contextLoads_alt() {
		/**
		 * Example 1: Input: "()" Output: true
		 */
		String example = "()";
		Assert.isTrue(BracketsUtils.hasValidBrackets_alt(example), "Example 1: Input: \"" + example + "\" Output: true");

		/**
		 * Example 2: Input: "()[]{}" Output: true
		 */
		example = "()[]{}";
		Assert.isTrue(BracketsUtils.hasValidBrackets_alt(example), "Example 2: Input: \"" + example + "\" Output: true");

		/**
		 * Example 3: Input: "(]" Output: false
		 */
		example = "(]";
		Assert.isTrue(!BracketsUtils.hasValidBrackets_alt(example), "Example 3: Input: \"" + example + "\" Output: fasle");
		/**
		 * Example 4: Input: "([)]" Output: false
		 * 
		 */
		example = "([)]";
		Assert.isTrue(!BracketsUtils.hasValidBrackets_alt(example), "Example 4: Input: \"" + example + "\" Output: false");
		/**
		 * Example 5: Input: "{[]}" Output: true
		 */
		example = "{[]}";
		Assert.isTrue(BracketsUtils.hasValidBrackets_alt(example), "Example 5: Input: \"" + example + "\" Output: true");
		/**
		 * Example 6: Input: "" Output: true
		 */
		example = "";
		Assert.isTrue(BracketsUtils.hasValidBrackets_alt(example), "Example 6: Input: \"" + example + "\" Output: true");
		/**
		 * Example 7: Input: "   " Output: true
		 */
		example = "   ";
		Assert.isTrue(BracketsUtils.hasValidBrackets_alt(example), "Example 7: Input: \"" + example + "\" Output: true");
		/**
		 * Example 8: Input: null Output: true
		 */
		example = null;
		Assert.isTrue(BracketsUtils.hasValidBrackets_alt(example), "Example 8: Input: \"null\" Output: true");
		/**
		 * Example 9: Input: "{[]}" Output: true
		 */
		example = "{abc[def]hij]qwer}";
		Assert.isTrue(!BracketsUtils.hasValidBrackets_alt(example), "Example 9: Input: \"" + example + "\" Output: false");
		/**
		 * Example 10: Input: "{" Output: true
		 */
		example = "{";
		Assert.isTrue(!BracketsUtils.hasValidBrackets_alt(example), "Example 10: Input: \"" + example + "\" Output: false");
	}
}
