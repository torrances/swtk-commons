package org.swtk.commons.dict.wordnet.index.name.instance.s.c.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04189751\", \"13151485\"]}");
	add("{\"term\":\"scapegoat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10574739\"]}");
	add("{\"term\":\"scapegrace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10574858\"]}");
	add("{\"term\":\"scaphiopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01651634\"]}");
	add("{\"term\":\"scaphocephaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14492092\"]}");
	add("{\"term\":\"scaphopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01943864\"]}");
	add("{\"term\":\"scaphopoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01943671\"]}");
	add("{\"term\":\"scaphosepalum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12102858\"]}");
	add("{\"term\":\"scapula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05287187\"]}");
	add("{\"term\":\"scapular\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04150557\", \"02471879\"]}");
	add("{\"term\":\"scapulary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04150557\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }