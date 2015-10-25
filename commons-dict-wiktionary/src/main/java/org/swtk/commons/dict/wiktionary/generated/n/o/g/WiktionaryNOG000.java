package org.swtk.commons.dict.wiktionary.generated.n.o.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNOG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("noggen", "{\"term\":\"noggen\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Coarse linen; a garment made of this\", \"priority\":1}]}, \"synonyms\":{}}");

	add("noggin", "{\"term\":\"noggin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Origin unknown. (Irish \u0027naigín\u0027 Scottish Gaelic \u0027noigean\u0027 are both from English.) Compare \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small mug, cup or ladle\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1889\u0027\u0027, w:Arthur Conan Arthur Conan Doyle, \u0027s:The Parson of Jackman’s The Parson of Jackman’s Gulch\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Here Nat Adams, the burly bar-keeper, dispensed bad whisky at the rate of two shillings a \u0027\u0027noggin\u0027\u0027, or a guinea a bottle\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A measure equivalent to a gill. Also possibly linked to the phrase “naggin of vodka” (a small bottle of vodka\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1836\u0027\u0027, w:Charles Charles Dickens, \u0027s:The Pickwick Papers/Chapter The Pickwick Papers\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"I don’t know whether…you…ever…went out to a slight lunch of a bushel of oysters, a dozen or so of bottled ale, and a \u0027\u0027noggin\u0027\u0027 or two of whiskey to close up with\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The head\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, James D. Doss, \u0027Dead Soul\u0027 [http://books.google.com/books?vid\u003dISBN0312317441\u0026amp;id\u003dLYVtbyi2BFEC\u0026amp;pg\u003dPA136\u0026amp;lpg\u003dPA136\u0026amp;ots\u003dcaRgQRq-7E\u0026amp;dq\u003d%22bumped+his+noggin%22\u0026amp;sig\u003dq5kBJVoKK15FwmN_EhcNVQeTPV4\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Or maybe he bumped his \u0027\u0027noggin\u0027\u0027 when he fell down—after he got clipped on the legs\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, John Farris, \u0027The Fury and the Power\u0027 [http://books.google.com/books?vid\u003dISBN0312877285\u0026amp;id\u003dYNLXjR-BKSQC\u0026amp;pg\u003dPA119\u0026amp;lpg\u003dPA119\u0026amp;ots\u003dBz5V2NIwpI\u0026amp;dq\u003d%22bumped+her+noggin%22\u0026amp;sig\u003diYyYDUozgqkUxVL0dFJVLrZubvc\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"She bumped her \u0027\u0027noggin\u0027\u0027 on the bulkhead above the doorway, smiled in apology for her presumed clumsiness\", \"priority\":11}]}, \"synonyms\":{}}");

	add("nogoodnik", "{\"term\":\"nogoodnik\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\", \"Yiddish\"], \"text\":\"From {{suffix|no good|nik|lang\u003den}}. Likely influenced by, evolved from, or borrowed directly into Yiddish from the Russian {{m|ru|негодник||worthless person, reprobate, ne\u0027er-do-well}})\u0026lt;ref name\u003d\u0026quot;casselman\u0026quot;\u0026gt;“[http://www.billcasselman.com/words_of_the_world/nogoodnik.htm Nudnik, Nogoodnik \u0026amp; Nu: Russian Origin of 3 Yiddish Words at Bill Casselman\u0027s Canadian Word of the Day \u0026amp; Words of the World]” (2007)\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A ne\u0027er-do-well; an individual who is no good\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1984\u0027\u0027, \u0027Money\u0027, Vintage 2005, p. 182\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Lorne\u0027s role was that of Gary, the \u0027\u0027nogoodnik\u0027\u0027 father\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }