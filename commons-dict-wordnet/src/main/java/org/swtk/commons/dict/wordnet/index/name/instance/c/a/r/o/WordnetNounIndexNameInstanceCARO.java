package org.swtk.commons.dict.wordnet.index.name.instance.c.a.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCARO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"carob\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07613906\", \"12513713\", \"12513931\"]}");
	add("{\"term\":\"caroche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02969520\"]}");
	add("{\"term\":\"carol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00547650\", \"07049493\"]}");
	add("{\"term\":\"caroler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09915853\"]}");
	add("{\"term\":\"carolina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09075291\"]}");
	add("{\"term\":\"carolinas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09075291\"]}");
	add("{\"term\":\"caroling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00547898\"]}");
	add("{\"term\":\"carolingian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09915972\"]}");
	add("{\"term\":\"carolinian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09761053\"]}");
	add("{\"term\":\"caroller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09915853\"]}");
	add("{\"term\":\"carolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10911733\"]}");
	add("{\"term\":\"carom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00501460\", \"07424075\"]}");
	add("{\"term\":\"carotene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14745397\", \"15115102\"]}");
	add("{\"term\":\"carotenemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14590187\"]}");
	add("{\"term\":\"carotenoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14745123\"]}");
	add("{\"term\":\"carothers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10903285\"]}");
	add("{\"term\":\"carotin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15115102\"]}");
	add("{\"term\":\"carousal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00512052\"]}");
	add("{\"term\":\"carouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00512052\"]}");
	add("{\"term\":\"carousel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02969645\", \"02969824\"]}");
	add("{\"term\":\"carouser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788989\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }