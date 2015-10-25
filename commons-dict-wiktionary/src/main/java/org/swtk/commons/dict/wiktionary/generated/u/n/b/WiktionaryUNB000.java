package org.swtk.commons.dict.wiktionary.generated.u.n.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUNB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("unbeatability", "{\"term\":\"unbeatability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027\u0027 + \u0027\u0027 + \u0027\u0027 (\u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being unbeatable, undefeatability\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unbeatableness", "{\"term\":\"unbeatableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027\u0027 + \u0027\u0027 + \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being unbeatable, unbeatability\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unbeing", "{\"term\":\"unbeing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|being|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"nonexistenc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Migene González-Wippler, \u0027What happens after death\u0027 (page 3\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"What we fear most is not death itself but the prospect of not being, or rather of \u0027\u0027unbeing\u0027\u0027, a state where we altogether cease to exist. The idea of unbeing is so alien to us that we find it almost impossible to conceive\", \"priority\":3}]}, \"synonyms\":{}}");

	add("unbelief", "{\"term\":\"unbelief\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|un|belief|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An absence (or rejection) of belief, especially religious belie\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1526\u0027\u0027, trans. \u0027Bible\u0027, Mark VI\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"And he coulde there shewe no myracles butt leyd his hondes apon a feawe sicke foolke and healed them. And he merveyled at their \u0027\u0027unbelefe\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1931\u0027\u0027, \u0027Sanctuary\u0027, Vintage 1993, p. 35\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"On hands and knees he looked at the empty siding and up at the sunfilled sky with \u0027\u0027unbelief\u0027\u0027 and despair\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, \u0027A History of Christianity\u0027, Penguin 2010, p. 781\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Soon Spinoza was regarded as the standard-bearer for \u0027\u0027unbelief\u0027\u0027, even though pervading his carefully-worded writings there is a clear notion of a divine spirit inhabiting the world, and a profound sense of wonder and reverence for mystery\", \"priority\":7}]}, \"synonyms\":{}}");

	add("unbiasedness", "{\"term\":\"unbiasedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unbiased|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the property of being unbiased; impartiality; lack of bias\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unbibium", "{\"term\":\"unbibium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"w:Systematic element name|Systematic element name.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The systematic element name for the (as yet undiscovered) chemical element with atomic number 122 (\u0027symbol\u0027 Ubb\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unbirthing", "{\"term\":\"unbirthing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|birthing|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Crawling back into a vagina and reentering the uterus (chiefly practiced in role-playing\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unbiunium", "{\"term\":\"unbiunium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The systematic element name for the (as yet undiscovered) chemical element with atomic number 121 (\u0027symbol\u0027 Ubu\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unblocker", "{\"term\":\"unblocker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|unblock|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, unblocks\", \"priority\":1}]}, \"synonyms\":{}}");

	add("unbreed", "{\"term\":\"unbreed\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|un|breed|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The mutt, considered as a breed in its own right\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Julia Szabo, \u0027The Underdog: A Celebration of Mutts\u0027, Workman Publishing (2005), ISBN 9780761133483\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"They are a generic, a noname animal, the \u0027\u0027unbreed\u0027\u0027, one of a kind, and in these days of mass-produced merchandise, of branding run rampant, the mutt\u0027s uniqueness is a priceless commodity\", \"priority\":3}]}, \"synonyms\":{}}");

	add("unbrokenness", "{\"term\":\"unbrokenness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being unbroken\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }