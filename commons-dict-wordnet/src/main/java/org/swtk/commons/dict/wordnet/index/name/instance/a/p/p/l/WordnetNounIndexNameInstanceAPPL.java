package org.swtk.commons.dict.wordnet.index.name.instance.a.p.p.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPPL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"applauder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09945546\"]}");
	add("{\"term\":\"applause\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06704734\"]}");
	add("{\"term\":\"apple\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12654755\", \"07755101\"]}");
	add("{\"term\":\"applecart\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02732166\", \"05803843\"]}");
	add("{\"term\":\"applejack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07919783\"]}");
	add("{\"term\":\"applemint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12877239\"]}");
	add("{\"term\":\"applesauce\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06624351\", \"07841826\"]}");
	add("{\"term\":\"applet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06582823\"]}");
	add("{\"term\":\"appleton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09180341\", \"10840217\"]}");
	add("{\"term\":\"applewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12654627\"]}");
	add("{\"term\":\"appliance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02732781\", \"02732963\"]}");
	add("{\"term\":\"applicability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13817392\"]}");
	add("{\"term\":\"applicant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09630310\"]}");
	add("{\"term\":\"application\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00036782\", \"00634572\", \"03696454\", \"06582286\", \"00713478\", \"06524571\", \"00950950\"]}");
	add("{\"term\":\"applicator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02733263\"]}");
	add("{\"term\":\"applier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02733263\", \"09630310\"]}");
	add("{\"term\":\"applique\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02733435\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }