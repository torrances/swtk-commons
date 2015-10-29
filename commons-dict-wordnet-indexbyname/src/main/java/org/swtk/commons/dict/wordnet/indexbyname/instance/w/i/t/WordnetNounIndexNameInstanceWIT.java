package org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10782010\", \"05625839\", \"06788939\"]}");
	add("{\"term\":\"witch\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10175045\", \"10799781\", \"09526414\", \"10075105\"]}");
	add("{\"term\":\"witch alder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12336516\"]}");
	add("{\"term\":\"witch broom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12542129\"]}");
	add("{\"term\":\"witch doctor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10804220\"]}");
	add("{\"term\":\"witch elm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12427584\"]}");
	add("{\"term\":\"witch grass\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12126095\", \"12147754\"]}");
	add("{\"term\":\"witch hazel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04603551\", \"12335325\"]}");
	add("{\"term\":\"witch hazel plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12335325\"]}");
	add("{\"term\":\"witchcraft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05988217\"]}");
	add("{\"term\":\"witchery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05988217\"]}");
	add("{\"term\":\"witchgrass\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12126095\", \"12147754\"]}");
	add("{\"term\":\"witching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01270676\"]}");
	add("{\"term\":\"withdrawal\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00229778\", \"00385741\", \"00850689\", \"01205289\", \"01265361\", \"07521270\", \"00054733\", \"01265206\", \"07220962\"]}");
	add("{\"term\":\"withdrawal method\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00850689\"]}");
	add("{\"term\":\"withdrawal symptom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14396462\"]}");
	add("{\"term\":\"withdrawer\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"10804471\", \"10804598\", \"10804761\", \"10804879\", \"10805009\", \"10805156\"]}");
	add("{\"term\":\"withdrawing room\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03239745\"]}");
	add("{\"term\":\"withdrawnness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04664353\"]}");
	add("{\"term\":\"withe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13185301\", \"04603724\"]}");
	add("{\"term\":\"withering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07441660\"]}");
	add("{\"term\":\"withers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02465233\"]}");
	add("{\"term\":\"witherspoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11413541\"]}");
	add("{\"term\":\"withholder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10805250\", \"10805371\"]}");
	add("{\"term\":\"withholding\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00812455\", \"13332390\", \"00362018\"]}");
	add("{\"term\":\"withholding tax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13332390\"]}");
	add("{\"term\":\"withstander\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09638241\", \"10805545\"]}");
	add("{\"term\":\"withy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13185301\"]}");
	add("{\"term\":\"witloof\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07747743\", \"11973808\"]}");
	add("{\"term\":\"witness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10806193\", \"10805946\", \"06747451\", \"10652848\", \"10805709\"]}");
	add("{\"term\":\"witness box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04603819\"]}");
	add("{\"term\":\"witness stand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04603819\"]}");
	add("{\"term\":\"witnesser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10805709\"]}");
	add("{\"term\":\"witold gombrowicz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11026124\"]}");
	add("{\"term\":\"wits\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05629979\"]}");
	add("{\"term\":\"wittgenstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11413823\"]}");
	add("{\"term\":\"witticism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06788939\"]}");
	add("{\"term\":\"wittiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06788939\"]}");
	add("{\"term\":\"wittol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10806431\"]}");
	add("{\"term\":\"witwatersrand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09024251\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }