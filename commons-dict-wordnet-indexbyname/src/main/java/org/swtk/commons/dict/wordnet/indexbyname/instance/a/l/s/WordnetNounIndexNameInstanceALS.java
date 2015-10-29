package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"al sunna wal jamma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08031369\"]}");
	add("{\"term\":\"als\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14129219\"]}");
	add("{\"term\":\"alsace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08959982\"]}");
	add("{\"term\":\"alsatia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08959982\"]}");
	add("{\"term\":\"alsatian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02109314\", \"09805227\"]}");
	add("{\"term\":\"alsobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12851734\"]}");
	add("{\"term\":\"alsobia dianthiflora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12851901\"]}");
	add("{\"term\":\"alsophila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02290128\"]}");
	add("{\"term\":\"alsophila pometaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02290274\"]}");
	add("{\"term\":\"alstonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11790482\"]}");
	add("{\"term\":\"alstonia scholaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11790725\"]}");
	add("{\"term\":\"alstroemeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12459076\"]}");
	add("{\"term\":\"alstroemeria pelegrina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12459288\"]}");
	add("{\"term\":\"alstroemeriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12458551\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }