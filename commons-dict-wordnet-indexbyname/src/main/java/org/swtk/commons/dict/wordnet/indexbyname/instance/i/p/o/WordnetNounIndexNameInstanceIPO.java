package org.swtk.commons.dict.wordnet.indexbyname.instance.i.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ipo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01096499\"]}");
	add("{\"term\":\"ipod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03589423\"]}");
	add("{\"term\":\"ipomoea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12847155\"]}");
	add("{\"term\":\"ipomoea alba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848297\"]}");
	add("{\"term\":\"ipomoea batatas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848444\"]}");
	add("{\"term\":\"ipomoea coccinea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848980\"]}");
	add("{\"term\":\"ipomoea fastigiata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848667\"]}");
	add("{\"term\":\"ipomoea imperialis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12849737\"]}");
	add("{\"term\":\"ipomoea leptophylla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12849139\"]}");
	add("{\"term\":\"ipomoea nil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12849551\"]}");
	add("{\"term\":\"ipomoea orizabensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12849280\"]}");
	add("{\"term\":\"ipomoea panurata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848667\"]}");
	add("{\"term\":\"ipomoea purpurea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12847655\"]}");
	add("{\"term\":\"ipomoea quamoclit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12848030\"]}");
	add("{\"term\":\"ipomoea tricolor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12847828\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }