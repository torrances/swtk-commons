package org.swtk.commons.dict.wordnet.index.name.instance.f.a.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFARM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"farm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03327044\"]}");
	add("{\"term\":\"farmer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10986488\", \"10986657\", \"10098586\"]}");
	add("{\"term\":\"farmerette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10098990\"]}");
	add("{\"term\":\"farmhand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099179\"]}");
	add("{\"term\":\"farmhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03327781\"]}");
	add("{\"term\":\"farming\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00454755\", \"00918295\"]}");
	add("{\"term\":\"farmington\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09091563\", \"09138306\"]}");
	add("{\"term\":\"farmland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09283813\", \"08587011\"]}");
	add("{\"term\":\"farmplace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03328041\"]}");
	add("{\"term\":\"farmstead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03328041\", \"13270498\"]}");
	add("{\"term\":\"farmyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03328156\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }