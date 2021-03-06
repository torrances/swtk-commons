package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jonah\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06451594\", \"10244116\", \"11109858\"]}");
	add("{\"term\":\"jonah crab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01981228\"]}");
	add("{\"term\":\"jonas edward salk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11299099\"]}");
	add("{\"term\":\"jonas salk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11299099\"]}");
	add("{\"term\":\"jonathan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07756831\"]}");
	add("{\"term\":\"jonathan edwards\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10971940\"]}");
	add("{\"term\":\"jonathan swift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11346864\"]}");
	add("{\"term\":\"jonathan trumbull\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11370509\"]}");
	add("{\"term\":\"jones\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"11110126\", \"11110225\", \"11110368\", \"11110502\", \"11110621\", \"11110874\"]}");
	add("{\"term\":\"jonesboro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09082646\"]}");
	add("{\"term\":\"jong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11111074\"]}");
	add("{\"term\":\"jongleur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10118862\"]}");
	add("{\"term\":\"jonquil\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12442634\", \"12442422\"]}");
	add("{\"term\":\"jons jakob berzelius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10869031\"]}");
	add("{\"term\":\"jonson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11111174\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }