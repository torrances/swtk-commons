package org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mepacrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04041117\"]}");
	add("{\"term\":\"meperidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03752594\"]}");
	add("{\"term\":\"meperidine hydrochloride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03752594\"]}");
	add("{\"term\":\"mephaquine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03748219\"]}");
	add("{\"term\":\"mephenytoin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03752772\"]}");
	add("{\"term\":\"mephistopheles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09624943\"]}");
	add("{\"term\":\"mephitinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02448195\"]}");
	add("{\"term\":\"mephitis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02448645\", \"05722841\", \"15060542\"]}");
	add("{\"term\":\"mephitis macroura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02448983\"]}");
	add("{\"term\":\"mephitis mephitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02448837\"]}");
	add("{\"term\":\"mephobarbital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03752999\"]}");
	add("{\"term\":\"meprin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03753237\"]}");
	add("{\"term\":\"meprobamate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03753237\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }