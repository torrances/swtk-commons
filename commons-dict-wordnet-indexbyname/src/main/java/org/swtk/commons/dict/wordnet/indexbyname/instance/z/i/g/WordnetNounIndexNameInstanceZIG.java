package org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zig\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13910012\"]}");
	add("{\"term\":\"zigadene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12487232\"]}");
	add("{\"term\":\"zigadenus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12486955\"]}");
	add("{\"term\":\"zigadenus elegans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12487523\"]}");
	add("{\"term\":\"zigadenus glaucus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12487702\"]}");
	add("{\"term\":\"zigadenus nuttalli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12487938\"]}");
	add("{\"term\":\"zigadenus venenosus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12488097\"]}");
	add("{\"term\":\"zigadenus venenosus gramineus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12488097\"]}");
	add("{\"term\":\"ziggurat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04622012\"]}");
	add("{\"term\":\"zigzag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13910012\"]}");
	add("{\"term\":\"zigzag goldenrod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12038999\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }