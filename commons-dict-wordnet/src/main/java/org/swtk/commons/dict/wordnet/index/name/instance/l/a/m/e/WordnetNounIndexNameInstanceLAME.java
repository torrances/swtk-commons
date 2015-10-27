package org.swtk.commons.dict.wordnet.index.name.instance.l.a.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lame\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03640621\", \"10662386\"]}");
	add("{\"term\":\"lamedh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06850945\"]}");
	add("{\"term\":\"lamella\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03640743\", \"05333608\", \"13032439\"]}");
	add("{\"term\":\"lamellibranch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01958574\"]}");
	add("{\"term\":\"lamellibranchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01958104\"]}");
	add("{\"term\":\"lamellicornia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02173906\"]}");
	add("{\"term\":\"lameness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14496484\", \"14573529\"]}");
	add("{\"term\":\"lament\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06391191\", \"07064659\", \"07226610\"]}");
	add("{\"term\":\"lamentation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01074160\", \"07226610\"]}");
	add("{\"term\":\"lamentations\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06450147\"]}");
	add("{\"term\":\"lamenter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10354959\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }