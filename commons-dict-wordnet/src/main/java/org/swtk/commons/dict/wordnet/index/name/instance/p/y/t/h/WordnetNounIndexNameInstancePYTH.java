package org.swtk.commons.dict.wordnet.index.name.instance.p.y.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePYTH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pythagoras\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11270046\"]}");
	add("{\"term\":\"pythia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09593808\"]}");
	add("{\"term\":\"pythiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13002863\"]}");
	add("{\"term\":\"pythias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11253585\"]}");
	add("{\"term\":\"pythium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13003228\"]}");
	add("{\"term\":\"pythius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09577148\"]}");
	add("{\"term\":\"python\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09524330\", \"10516512\", \"01746246\"]}");
	add("{\"term\":\"pythoness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09593808\", \"10516631\"]}");
	add("{\"term\":\"pythonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01746090\"]}");
	add("{\"term\":\"pythoninae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01745864\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }