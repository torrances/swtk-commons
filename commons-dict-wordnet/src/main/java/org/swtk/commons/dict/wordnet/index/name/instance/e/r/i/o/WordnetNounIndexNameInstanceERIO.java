package org.swtk.commons.dict.wordnet.index.name.instance.e.r.i.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceERIO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eriobotrya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12650284\"]}");
	add("{\"term\":\"eriocaulaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12629702\"]}");
	add("{\"term\":\"eriocaulon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12629889\"]}");
	add("{\"term\":\"eriodictyon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12856338\"]}");
	add("{\"term\":\"eriogonum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12623023\"]}");
	add("{\"term\":\"eriophorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12172923\"]}");
	add("{\"term\":\"eriophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11988041\"]}");
	add("{\"term\":\"eriosoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02256244\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }