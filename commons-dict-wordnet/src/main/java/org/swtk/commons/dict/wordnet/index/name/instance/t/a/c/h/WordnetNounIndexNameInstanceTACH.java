package org.swtk.commons.dict.wordnet.index.name.instance.t.a.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTACH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389967\"]}");
	add("{\"term\":\"tacheometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04390102\"]}");
	add("{\"term\":\"tachinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02195325\"]}");
	add("{\"term\":\"tachistoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389624\"]}");
	add("{\"term\":\"tachogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07019013\"]}");
	add("{\"term\":\"tachograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389782\"]}");
	add("{\"term\":\"tachometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04389967\"]}");
	add("{\"term\":\"tachycardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14386432\"]}");
	add("{\"term\":\"tachyglossidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01874735\"]}");
	add("{\"term\":\"tachyglossus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01874885\"]}");
	add("{\"term\":\"tachygraphy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06361497\"]}");
	add("{\"term\":\"tachylite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14905375\"]}");
	add("{\"term\":\"tachymeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04390102\"]}");
	add("{\"term\":\"tachypleus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01790798\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }