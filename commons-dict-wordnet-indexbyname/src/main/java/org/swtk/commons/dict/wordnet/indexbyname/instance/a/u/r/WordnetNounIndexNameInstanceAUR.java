package org.swtk.commons.dict.wordnet.indexbyname.instance.a.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aura\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04734472\", \"04958893\", \"14325980\"]}");
	add("{\"term\":\"aurelius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10839359\"]}");
	add("{\"term\":\"aureolaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12899285\"]}");
	add("{\"term\":\"aureole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04958893\", \"11447181\"]}");
	add("{\"term\":\"aureomycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03027098\"]}");
	add("{\"term\":\"auricle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05331437\", \"05399691\"]}");
	add("{\"term\":\"auricula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05399905\", \"12112323\"]}");
	add("{\"term\":\"auriculare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05238922\"]}");
	add("{\"term\":\"auricularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13083032\"]}");
	add("{\"term\":\"auriculariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13082872\"]}");
	add("{\"term\":\"auriculariales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13082681\"]}");
	add("{\"term\":\"auriga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09233963\"]}");
	add("{\"term\":\"auriparus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01596064\"]}");
	add("{\"term\":\"auriscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863703\"]}");
	add("{\"term\":\"aurochs\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02407753\", \"02413546\"]}");
	add("{\"term\":\"aurora\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09595291\", \"11447355\", \"15193837\"]}");
	add("{\"term\":\"auroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863703\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }