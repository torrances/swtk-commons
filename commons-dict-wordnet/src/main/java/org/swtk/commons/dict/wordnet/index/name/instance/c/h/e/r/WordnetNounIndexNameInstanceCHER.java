package org.swtk.commons.dict.wordnet.index.name.instance.c.h.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cherbourg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08955447\"]}");
	add("{\"term\":\"cheremis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06970027\", \"09725792\"]}");
	add("{\"term\":\"cheremiss\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06970027\", \"09725792\"]}");
	add("{\"term\":\"cherepovets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09026865\"]}");
	add("{\"term\":\"cherimolla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07777117\"]}");
	add("{\"term\":\"cherimoya\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07777117\", \"11714769\"]}");
	add("{\"term\":\"chermidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02258662\"]}");
	add("{\"term\":\"chernobyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09038735\"]}");
	add("{\"term\":\"cherokee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09671495\", \"06928893\"]}");
	add("{\"term\":\"cheroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03017773\"]}");
	add("{\"term\":\"cherry\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04971620\", \"07773108\", \"12662174\", \"12662557\"]}");
	add("{\"term\":\"cherrystone\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01961076\", \"07803246\"]}");
	add("{\"term\":\"chert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14894676\"]}");
	add("{\"term\":\"cherub\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09562841\", \"09935035\"]}");
	add("{\"term\":\"cherubini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10914657\"]}");
	add("{\"term\":\"chervil\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07832815\", \"12953466\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }