package org.swtk.commons.dict.wordnet.index.name.instance.g.u.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guidance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00816981\", \"01147389\", \"06663446\"]}");
	add("{\"term\":\"guide\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03470959\", \"10582177\", \"05947694\", \"06434383\", \"10171090\", \"10761478\"]}");
	add("{\"term\":\"guidebook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06434383\"]}");
	add("{\"term\":\"guideline\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05857068\", \"05921146\", \"06814996\"]}");
	add("{\"term\":\"guidepost\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06807231\", \"05857068\"]}");
	add("{\"term\":\"guideword\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06302383\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }