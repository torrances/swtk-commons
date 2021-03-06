package org.swtk.commons.dict.wordnet.indexbyname.instance.k.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"keel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03614755\", \"05235704\", \"13942952\"]}");
	add("{\"term\":\"keel arch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03848274\"]}");
	add("{\"term\":\"keelboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03614999\"]}");
	add("{\"term\":\"keeled garlic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12453212\"]}");
	add("{\"term\":\"keelson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03615172\"]}");
	add("{\"term\":\"keen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07056481\"]}");
	add("{\"term\":\"keenness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04712672\", \"07570749\", \"05628251\"]}");
	add("{\"term\":\"keep\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03530432\", \"03615311\", \"13386459\"]}");
	add("{\"term\":\"keeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10003828\", \"10249168\"]}");
	add("{\"term\":\"keeping\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00812259\", \"00820127\", \"01207500\"]}");
	add("{\"term\":\"keepsake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03615483\"]}");
	add("{\"term\":\"keeshond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02115002\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }