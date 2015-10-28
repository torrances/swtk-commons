package org.swtk.commons.dict.wordnet.indexbyname.instance.v.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05404676\"]}");
	add("{\"term\":\"vasarely\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381137\"]}");
	add("{\"term\":\"vasari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381283\"]}");
	add("{\"term\":\"vascularisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13594063\"]}");
	add("{\"term\":\"vascularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05221737\"]}");
	add("{\"term\":\"vascularization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13594063\"]}");
	add("{\"term\":\"vasculitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14382027\"]}");
	add("{\"term\":\"vase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04529463\"]}");
	add("{\"term\":\"vasectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00717431\"]}");
	add("{\"term\":\"vaseline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04529604\"]}");
	add("{\"term\":\"vasoconstriction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01152591\"]}");
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
	add("{\"term\":\"vassal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766249\"]}");
	add("{\"term\":\"vassalage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14021748\"]}");
	add("{\"term\":\"vastness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05111848\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }