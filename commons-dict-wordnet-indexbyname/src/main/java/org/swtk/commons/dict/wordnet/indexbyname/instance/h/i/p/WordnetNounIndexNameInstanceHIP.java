package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hip\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"12641307\", \"13913372\", \"05603759\", \"05604406\", \"05563958\"]}");
	add("{\"term\":\"hipbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05282458\"]}");
	add("{\"term\":\"hipflask\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03526838\"]}");
	add("{\"term\":\"hipline\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08601081\", \"08601209\"]}");
	add("{\"term\":\"hipparchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11071371\"]}");
	add("{\"term\":\"hippeastrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12441642\"]}");
	add("{\"term\":\"hippie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10196106\"]}");
	add("{\"term\":\"hippies\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08306762\"]}");
	add("{\"term\":\"hippo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02401173\", \"08724959\"]}");
	add("{\"term\":\"hippobosca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02201366\"]}");
	add("{\"term\":\"hippoboscid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02201184\"]}");
	add("{\"term\":\"hippoboscidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02200984\"]}");
	add("{\"term\":\"hippocampus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01459272\", \"05503912\"]}");
	add("{\"term\":\"hippocastanaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12788711\"]}");
	add("{\"term\":\"hippocrates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11071627\"]}");
	add("{\"term\":\"hippocrepis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12555606\"]}");
	add("{\"term\":\"hippodamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02169088\"]}");
	add("{\"term\":\"hippodrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03527166\"]}");
	add("{\"term\":\"hippoglossoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02662591\"]}");
	add("{\"term\":\"hippoglossus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02663042\"]}");
	add("{\"term\":\"hippopotamidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02400904\"]}");
	add("{\"term\":\"hippopotamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02401173\"]}");
	add("{\"term\":\"hipposideridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02146246\"]}");
	add("{\"term\":\"hipposideros\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02146411\"]}");
	add("{\"term\":\"hippotragus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02428402\"]}");
	add("{\"term\":\"hippy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10196106\"]}");
	add("{\"term\":\"hipster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10196106\"]}");
	add("{\"term\":\"hipsters\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08306762\"]}");
	add("{\"term\":\"hipsurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02573665\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }