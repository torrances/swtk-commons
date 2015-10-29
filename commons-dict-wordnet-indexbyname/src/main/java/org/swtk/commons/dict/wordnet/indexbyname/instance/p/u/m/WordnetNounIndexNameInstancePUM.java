package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"puma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02127963\"]}");
	add("{\"term\":\"pumice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14724599\"]}");
	add("{\"term\":\"pumice stone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14724599\"]}");
	add("{\"term\":\"pummelo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12729863\"]}");
	add("{\"term\":\"pump\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04028726\", \"05396148\", \"04028192\"]}");
	add("{\"term\":\"pump action\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04028828\"]}");
	add("{\"term\":\"pump house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04029102\"]}");
	add("{\"term\":\"pump priming\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00271247\", \"01125075\"]}");
	add("{\"term\":\"pump room\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04029260\"]}");
	add("{\"term\":\"pump well\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04029513\"]}");
	add("{\"term\":\"pumpernickel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07701663\"]}");
	add("{\"term\":\"pumping station\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04029102\"]}");
	add("{\"term\":\"pumpkin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07751486\", \"12178960\"]}");
	add("{\"term\":\"pumpkin ash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12326606\"]}");
	add("{\"term\":\"pumpkin pie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07642330\"]}");
	add("{\"term\":\"pumpkin seed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07786739\"]}");
	add("{\"term\":\"pumpkin vine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12178960\"]}");
	add("{\"term\":\"pumpkinseed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02566279\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }