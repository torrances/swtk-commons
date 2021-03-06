package org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bimbo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09874114\"]}");
	add("{\"term\":\"bimester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15229405\"]}");
	add("{\"term\":\"bimetal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14800396\"]}");
	add("{\"term\":\"bimetallic strip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02842987\"]}");
	add("{\"term\":\"bimetallism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13394919\"]}");
	add("{\"term\":\"bimetallist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09874219\"]}");
	add("{\"term\":\"bimillenary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15166335\", \"15277111\"]}");
	add("{\"term\":\"bimillennium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15166335\", \"15277111\"]}");
	add("{\"term\":\"bimli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12198646\"]}");
	add("{\"term\":\"bimli hemp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12198646\"]}");
	add("{\"term\":\"bimonthly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06606955\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }