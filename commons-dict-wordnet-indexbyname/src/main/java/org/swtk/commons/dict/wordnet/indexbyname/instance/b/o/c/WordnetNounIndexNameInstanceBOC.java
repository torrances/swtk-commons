package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boccaccio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10873742\"]}");
	add("{\"term\":\"bocce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00464058\"]}");
	add("{\"term\":\"bocce ball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02864487\"]}");
	add("{\"term\":\"bocci\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00464058\"]}");
	add("{\"term\":\"bocci ball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02864487\"]}");
	add("{\"term\":\"boccie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00464058\"]}");
	add("{\"term\":\"boccie ball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02864487\"]}");
	add("{\"term\":\"bocconia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11923802\", \"11926983\"]}");
	add("{\"term\":\"bocconia frutescens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11923802\"]}");
	add("{\"term\":\"boche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09767570\"]}");
	add("{\"term\":\"bock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07903436\"]}");
	add("{\"term\":\"bock beer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07903436\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }