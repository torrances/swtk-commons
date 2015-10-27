package org.swtk.commons.dict.wordnet.index.name.instance.e.p.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEPIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"epipactis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12082728\"]}");
	add("{\"term\":\"epipaleolithic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15258036\"]}");
	add("{\"term\":\"epiphany\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15219341\", \"07338205\"]}");
	add("{\"term\":\"epiphenomenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11474152\"]}");
	add("{\"term\":\"epiphora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07114779\"]}");
	add("{\"term\":\"epiphyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11867234\"]}");
	add("{\"term\":\"epiphysis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05492750\", \"05600259\"]}");
	add("{\"term\":\"epiphyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13143744\"]}");
	add("{\"term\":\"epiplexis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07118068\"]}");
	add("{\"term\":\"epipremnum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11809005\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }