package org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"law\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"08226608\", \"00612411\", \"06171434\", \"05881589\", \"05879538\", \"06544321\", \"08458195\"]}");
	add("{\"term\":\"lawbreaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10774117\"]}");
	add("{\"term\":\"lawcourt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03654773\"]}");
	add("{\"term\":\"lawfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04817036\"]}");
	add("{\"term\":\"lawgiver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10268967\"]}");
	add("{\"term\":\"lawlessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04818378\", \"13996506\"]}");
	add("{\"term\":\"lawmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10268967\"]}");
	add("{\"term\":\"lawmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01128014\"]}");
	add("{\"term\":\"lawman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10269156\"]}");
	add("{\"term\":\"lawn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08609148\"]}");
	add("{\"term\":\"lawrence\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"09111114\", \"11140136\", \"11140358\", \"11140520\", \"11140623\", \"11140824\", \"11141098\"]}");
	add("{\"term\":\"lawrencium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14667501\"]}");
	add("{\"term\":\"laws\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06463561\"]}");
	add("{\"term\":\"lawsuit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01185144\"]}");
	add("{\"term\":\"lawton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09154954\"]}");
	add("{\"term\":\"lawyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10269647\"]}");
	add("{\"term\":\"lawyerbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12674197\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }