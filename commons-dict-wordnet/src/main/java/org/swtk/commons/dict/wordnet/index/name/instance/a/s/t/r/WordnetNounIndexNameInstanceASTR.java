package org.swtk.commons.dict.wordnet.index.name.instance.a.s.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"astragal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02818372\", \"05278882\"]}");
	add("{\"term\":\"astragalus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05278882\", \"12528582\"]}");
	add("{\"term\":\"astrakhan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09026728\", \"14788619\"]}");
	add("{\"term\":\"astrantia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12954796\"]}");
	add("{\"term\":\"astraphobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14406472\"]}");
	add("{\"term\":\"astreus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13066594\"]}");
	add("{\"term\":\"astringence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05725496\"]}");
	add("{\"term\":\"astringency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05209302\", \"05725496\"]}");
	add("{\"term\":\"astringent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02753840\"]}");
	add("{\"term\":\"astrobiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06081272\"]}");
	add("{\"term\":\"astrocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05475410\"]}");
	add("{\"term\":\"astrodome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02754072\"]}");
	add("{\"term\":\"astrodynamics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106058\"]}");
	add("{\"term\":\"astrogator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837099\"]}");
	add("{\"term\":\"astroglia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05475271\"]}");
	add("{\"term\":\"astrolabe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02754220\"]}");
	add("{\"term\":\"astrolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047731\"]}");
	add("{\"term\":\"astrologer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837221\"]}");
	add("{\"term\":\"astrologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837221\"]}");
	add("{\"term\":\"astrology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05786128\"]}");
	add("{\"term\":\"astroloma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12274531\"]}");
	add("{\"term\":\"astrometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106207\"]}");
	add("{\"term\":\"astronaut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837427\"]}");
	add("{\"term\":\"astronautics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106520\"]}");
	add("{\"term\":\"astronavigation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00818191\"]}");
	add("{\"term\":\"astronium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12780256\"]}");
	add("{\"term\":\"astronomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837748\"]}");
	add("{\"term\":\"astronomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104629\"]}");
	add("{\"term\":\"astrophysicist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09838696\"]}");
	add("{\"term\":\"astrophysics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107382\"]}");
	add("{\"term\":\"astrophyton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02321190\"]}");
	add("{\"term\":\"astropogon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02575259\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }