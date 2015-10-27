package org.swtk.commons.dict.wordnet.index.name.instance.m.o.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOLL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10347141\"]}");
	add("{\"term\":\"mollah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357944\"]}");
	add("{\"term\":\"molle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12785875\"]}");
	add("{\"term\":\"mollie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01452621\"]}");
	add("{\"term\":\"mollienesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01452498\"]}");
	add("{\"term\":\"mollification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01153592\", \"13994211\"]}");
	add("{\"term\":\"molluga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11841884\"]}");
	add("{\"term\":\"mollusc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01943377\"]}");
	add("{\"term\":\"mollusca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01943129\"]}");
	add("{\"term\":\"molluscum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14253714\"]}");
	add("{\"term\":\"mollusk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01943377\"]}");
	add("{\"term\":\"molly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01452621\"]}");
	add("{\"term\":\"mollycoddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10347249\"]}");
	add("{\"term\":\"mollycoddler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10415089\"]}");
	add("{\"term\":\"mollymawk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02060875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }