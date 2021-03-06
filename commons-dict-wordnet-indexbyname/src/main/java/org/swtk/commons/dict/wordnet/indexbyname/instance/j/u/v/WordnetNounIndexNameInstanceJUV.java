package org.swtk.commons.dict.wordnet.indexbyname.instance.j.u.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"juvenal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11115381\"]}");
	add("{\"term\":\"juvenescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13525606\"]}");
	add("{\"term\":\"juvenile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09645219\"]}");
	add("{\"term\":\"juvenile amaurotic idiocy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14192610\"]}");
	add("{\"term\":\"juvenile body\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05226571\"]}");
	add("{\"term\":\"juvenile court\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08350795\"]}");
	add("{\"term\":\"juvenile delinquency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00737517\"]}");
	add("{\"term\":\"juvenile delinquent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10020538\"]}");
	add("{\"term\":\"juvenile diabetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14141905\"]}");
	add("{\"term\":\"juvenile person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09645219\"]}");
	add("{\"term\":\"juvenile rheumatoid arthritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14211512\"]}");
	add("{\"term\":\"juvenile wart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04704317\"]}");
	add("{\"term\":\"juvenility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04935762\", \"14449972\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }