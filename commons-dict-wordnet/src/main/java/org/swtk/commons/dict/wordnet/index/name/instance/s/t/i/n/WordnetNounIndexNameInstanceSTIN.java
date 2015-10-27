package org.swtk.commons.dict.wordnet.index.name.instance.s.t.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sting\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00410782\", \"00780744\", \"14321372\", \"14353167\", \"14355490\"]}");
	add("{\"term\":\"stinger\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01177478\", \"02468324\", \"04327543\", \"06734210\", \"07934549\"]}");
	add("{\"term\":\"stinginess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04840689\"]}");
	add("{\"term\":\"stinging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14355490\"]}");
	add("{\"term\":\"stingray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01500682\"]}");
	add("{\"term\":\"stink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"stinkbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01812393\"]}");
	add("{\"term\":\"stinker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03661164\", \"04327869\", \"10559272\"]}");
	add("{\"term\":\"stinkhorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13061063\"]}");
	add("{\"term\":\"stinkiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04987905\"]}");
	add("{\"term\":\"stinkpot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01670073\", \"10559272\"]}");
	add("{\"term\":\"stinkweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11919244\"]}");
	add("{\"term\":\"stint\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00721683\", \"02030011\", \"15159442\"]}");
	add("{\"term\":\"stinter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10676271\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }