package org.swtk.commons.dict.wordnet.index.name.instance.w.a.t.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWATC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"watch\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01031703\", \"10290913\", \"15317745\", \"00882340\", \"15317579\", \"04563183\"]}");
	add("{\"term\":\"watchband\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04563490\"]}");
	add("{\"term\":\"watchdog\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02106493\", \"10789275\"]}");
	add("{\"term\":\"watcher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10789450\", \"10789727\", \"10652848\"]}");
	add("{\"term\":\"watchfulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04672135\", \"05713669\"]}");
	add("{\"term\":\"watching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00881437\"]}");
	add("{\"term\":\"watchmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10789573\"]}");
	add("{\"term\":\"watchman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10789727\"]}");
	add("{\"term\":\"watchstrap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04563490\"]}");
	add("{\"term\":\"watchtower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04564234\"]}");
	add("{\"term\":\"watchword\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06686933\", \"07167460\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }