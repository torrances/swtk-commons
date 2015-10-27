package org.swtk.commons.dict.wordnet.index.name.instance.v.a.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVASO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vasoconstriction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01152591\"]}");
	add("{\"term\":\"vasoconstrictive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04529716\"]}");
	add("{\"term\":\"vasoconstrictor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04529716\"]}");
	add("{\"term\":\"vasodilation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00367033\"]}");
	add("{\"term\":\"vasodilative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04530199\"]}");
	add("{\"term\":\"vasodilator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04530199\"]}");
	add("{\"term\":\"vasomax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928683\"]}");
	add("{\"term\":\"vasopressin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05421490\"]}");
	add("{\"term\":\"vasopressor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04530496\"]}");
	add("{\"term\":\"vasosection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00717649\"]}");
	add("{\"term\":\"vasotec\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03290017\"]}");
	add("{\"term\":\"vasotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00717649\"]}");
	add("{\"term\":\"vasovasostomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00717772\"]}");
	add("{\"term\":\"vasovesiculitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382114\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }