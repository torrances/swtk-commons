package org.swtk.commons.dict.wordnet.index.name.instance.c.l.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clerestory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03045795\"]}");
	add("{\"term\":\"clergy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08169784\"]}");
	add("{\"term\":\"clergyman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09946909\"]}");
	add("{\"term\":\"cleric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09947594\"]}");
	add("{\"term\":\"clericalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06501401\"]}");
	add("{\"term\":\"clericalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09947822\"]}");
	add("{\"term\":\"clerid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02173645\"]}");
	add("{\"term\":\"cleridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02173500\"]}");
	add("{\"term\":\"clerihew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06390250\"]}");
	add("{\"term\":\"clerisy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08404085\"]}");
	add("{\"term\":\"clerk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10567784\", \"09947909\"]}");
	add("{\"term\":\"clerking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00620470\"]}");
	add("{\"term\":\"clerkship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00591633\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }