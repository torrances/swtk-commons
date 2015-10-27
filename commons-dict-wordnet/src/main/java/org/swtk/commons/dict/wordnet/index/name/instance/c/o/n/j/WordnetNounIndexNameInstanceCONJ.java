package org.swtk.commons.dict.wordnet.index.name.instance.c.o.n.j;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCONJ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"conjecture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05781920\", \"06795537\", \"05900390\"]}");
	add("{\"term\":\"conjugate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14844595\"]}");
	add("{\"term\":\"conjugation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"00848970\", \"08023183\", \"08023310\", \"13826297\", \"14444358\"]}");
	add("{\"term\":\"conjunction\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03611128\", \"07429767\", \"13821604\", \"06336819\", \"14444358\", \"05055452\"]}");
	add("{\"term\":\"conjunctiva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05322645\"]}");
	add("{\"term\":\"conjunctive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06336819\"]}");
	add("{\"term\":\"conjunctivitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14364837\"]}");
	add("{\"term\":\"conjuncture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07431898\"]}");
	add("{\"term\":\"conjuration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00100771\", \"05987026\", \"07174767\"]}");
	add("{\"term\":\"conjurer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10074989\", \"10300371\"]}");
	add("{\"term\":\"conjuring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05987026\"]}");
	add("{\"term\":\"conjuror\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10074989\", \"10300371\"]}");
	add("{\"term\":\"conjury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05987026\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }