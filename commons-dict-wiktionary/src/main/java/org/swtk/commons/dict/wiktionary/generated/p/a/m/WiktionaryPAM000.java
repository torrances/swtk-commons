package org.swtk.commons.dict.wiktionary.generated.p.a.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPAM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pampas", "{\"term\":\"pampas\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"Quechua\"], \"text\":\"From (plural of) American Spanish \u0027pampa\u0027 from Quechua \u0027pampa\u0027 (land, ground)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The extensive plains of South America south of the Amazon\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pampathy", "{\"term\":\"pampathy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Formed as {{confix|pan|alt1\u003dpam|pathy|gloss1\u003dall|gloss2\u003dfeeling|lang\u003den}} after \u0027sympathy\u0027 \u0027empathy\u0027 etc.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The supposed that causes its possessors to to with the “” of\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1918\u0027\u0027, Lydia Gillingham Robinson (translator), (author), \u0027What Is a Dogma?\u0027 [http://books.google.co.uk/books?ei\u003dtjVVUrWnJ4ic0AXB2YDIAw\u0026amp;id\u003dbO42AAAAMAAJ\u0026amp;dq\u003dpampathy\u0026amp;q\u003d%22a+%27pampathy%27+or+all-feeling%2\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"search_anchor page 5\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"It is a “\u0027\u0027pampathy\u0027\u0027” or all-feeling which produces in every individual a deep-felt longing to be at one with the whole universe of which each is a part\", \"priority\":4}]}, \"synonyms\":{}}");

	add("pamphlet", "{\"term\":\"pamphlet\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027panfletus\u0027 (lang\u003dla)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small booklet of printed informational matter, often unbound, having only a paper cover\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pamphleteer", "{\"term\":\"pamphleteer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|pamphlet|eer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a writer or publisher of pamphlets, a second-rate journalis\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1713\u0027\u0027: Jonathan Swift, \u0027The Journal to Stella\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The Commons are very slow in bringing in their Bill to limit the press, and the \u0027\u0027pamphleteers\u0027\u0027 make good use of their time; for there come out three or four every day\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1891\u0027\u0027: Oscar Wilde, \u0027Intentions\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"but Charles Reade, an artist, a scholar, a man with a true sense of beauty, raging and roaring over the abuses of contemporary life like a common \u0027\u0027pamphleteer\u0027\u0027 or a sensational journalist, is really a sight for the angels to weep over\", \"priority\":5}]}, \"synonyms\":{}}");

	add("pamphleteering", "{\"term\":\"pamphleteering\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The printing and distribution of pamphlets, especially as propaganda\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }