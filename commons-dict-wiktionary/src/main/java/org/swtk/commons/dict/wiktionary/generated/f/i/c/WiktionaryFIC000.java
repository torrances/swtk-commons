package org.swtk.commons.dict.wiktionary.generated.f.i.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFIC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fiche", "{\"term\":\"fiche\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a microfiche\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fichu", "{\"term\":\"fichu\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027fichu\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman\u0027s lightweight triangular scarf worn over the shoulders and tied in fron\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1789,\u0027\u0027 \u0027The Ladies Magazine\u0027, January 1789, \u0026quot;Fashionable Dresses: The First Lady\u0027s Dress\u0026quot;, page 5\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"On the neck—an ample \u0027\u0027Fichu\u0027\u0027, very prominent, the point of which behind goes under the jacket and the ends before go under the stomache\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1868\u0027\u0027 \u0027London Society\u0027, vol. XIII, \u0026quot;Fashion at Longchamps\u0026quot;, page 40\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027fichu\u0027\u0027 proper, introduced by Marie Antoinette, not before the décolletée style of toilette made it positively necessary, was nothing more than a lace kerchief worn crossed over the shoulders\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1919,\u0027\u0027 w:Ronald Ronald Firbank, Valmouth\u0027, Duckworth, hardback edition, page 9\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"She wore a dress of filmy white stuff, embroidered with bunches of pale mauve thistles, a full \u0027\u0027fichu\u0027\u0027, and a large mauve hat with wide mauve ribbons, tied in front in a large knot where the \u0027\u0027fichu\u0027\u0027 was crossed on her bosom\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"1969\u0027\u0027, Vladimir Nabokov, \u0027Ada or Ardor\u0027, Penguin 2011, p. 285\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Assistant Van admired her elegant slenderness, the gray tailor-made suit, the smoky \u0027\u0027fichu\u0027\u0027 and as it wafted away, her long white neck.Category:en:Neckwear\", \"priority\":9}]}, \"synonyms\":{}}");

	add("fictionalism", "{\"term\":\"fictionalism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fictional|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The doctrine that certain concepts are simply convenient fiction\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fictionalizer", "{\"term\":\"fictionalizer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fictionalize|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who fictionalize\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fictioneer", "{\"term\":\"fictioneer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fiction|eer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A writer of fiction, especially one who produces many publications\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fictiveness", "{\"term\":\"fictiveness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fictive|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being fictive\", \"priority\":1}]}, \"synonyms\":{}}");

	add("fictography", "{\"term\":\"fictography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fictionalized biography; a biography written about a fictional character. For example, \u0027w:Gulliver\u0027s Gulliver\u0027s Travels\u0027 written by w:Jonathan Jonathan Swift but presented as being written by Lemuel Gulliver, the novel\u0027s main character\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ficus", "{\"term\":\"ficus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Borrowed from Latin {{m|la|fīcus||fig}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant belonging to the genus \u0027Ficus\u0027, including the rubber plant\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }