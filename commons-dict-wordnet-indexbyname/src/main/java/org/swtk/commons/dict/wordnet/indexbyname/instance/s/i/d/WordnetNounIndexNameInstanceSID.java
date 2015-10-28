package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12206633\"]}");
	add("{\"term\":\"sidalcea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12207547\"]}");
	add("{\"term\":\"siddhartha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555346\"]}");
	add("{\"term\":\"siddons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11319496\"]}");
	add("{\"term\":\"side\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"07457169\", \"09460358\", \"06796122\", \"07671235\", \"08119248\", \"08666742\", \"05861118\", \"04220693\", \"08527687\", \"05558951\", \"08425666\", \"08666920\"]}");
	add("{\"term\":\"sidebar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06282056\", \"07158158\"]}");
	add("{\"term\":\"sideboard\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02915411\", \"04221113\", \"04221221\"]}");
	add("{\"term\":\"sideburn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05270301\"]}");
	add("{\"term\":\"sidecar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04221349\", \"07933632\"]}");
	add("{\"term\":\"sidekick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09897417\"]}");
	add("{\"term\":\"sidelight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04221716\"]}");
	add("{\"term\":\"sideline\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00433629\", \"04221938\", \"08668679\"]}");
	add("{\"term\":\"siderite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09457141\", \"15064394\"]}");
	add("{\"term\":\"sideritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12889008\"]}");
	add("{\"term\":\"sideroblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05456403\"]}");
	add("{\"term\":\"siderocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05462554\"]}");
	add("{\"term\":\"sideropenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14192135\"]}");
	add("{\"term\":\"siderophilin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15102484\"]}");
	add("{\"term\":\"siderosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14173952\"]}");
	add("{\"term\":\"sidesaddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04222220\"]}");
	add("{\"term\":\"sideshow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00524204\", \"07375557\"]}");
	add("{\"term\":\"sideslip\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00171531\", \"00329857\"]}");
	add("{\"term\":\"sidesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10615756\"]}");
	add("{\"term\":\"sidesplitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06791764\"]}");
	add("{\"term\":\"sidestep\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00287204\"]}");
	add("{\"term\":\"sidestroke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00571720\"]}");
	add("{\"term\":\"sideswipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07425213\"]}");
	add("{\"term\":\"sidetrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04223173\"]}");
	add("{\"term\":\"sidewalk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04222469\"]}");
	add("{\"term\":\"sidewall\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04222655\", \"04222751\"]}");
	add("{\"term\":\"sidewinder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04222977\", \"01758932\"]}");
	add("{\"term\":\"siding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15065617\", \"04223173\"]}");
	add("{\"term\":\"sidney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11319667\"]}");
	add("{\"term\":\"sidon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08977985\"]}");
	add("{\"term\":\"sids\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14333719\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }