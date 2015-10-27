package org.swtk.commons.dict.wordnet.index.name.instance.p.a.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePANA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"panacea\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03886467\", \"09586171\"]}");
	add("{\"term\":\"panache\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03886648\", \"04820120\"]}");
	add("{\"term\":\"panadol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02677336\"]}");
	add("{\"term\":\"panama\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02862524\", \"08757039\"]}");
	add("{\"term\":\"panamanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09745534\"]}");
	add("{\"term\":\"panamica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12415980\"]}");
	add("{\"term\":\"panamiga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12415980\"]}");
	add("{\"term\":\"panatela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03886904\"]}");
	add("{\"term\":\"panax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11819989\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }