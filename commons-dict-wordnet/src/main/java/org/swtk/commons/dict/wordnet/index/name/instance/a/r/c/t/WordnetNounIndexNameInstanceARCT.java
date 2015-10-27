package org.swtk.commons.dict.wordnet.index.name.instance.a.r.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARCT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arctan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13810394\"]}");
	add("{\"term\":\"arctangent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13810394\"]}");
	add("{\"term\":\"arctic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02738543\", \"08513487\"]}");
	add("{\"term\":\"arctictis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02138633\"]}");
	add("{\"term\":\"arctiid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02308059\"]}");
	add("{\"term\":\"arctiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02307897\"]}");
	add("{\"term\":\"arctium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11944799\"]}");
	add("{\"term\":\"arctocebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02502065\"]}");
	add("{\"term\":\"arctocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02079675\"]}");
	add("{\"term\":\"arctonyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02451385\"]}");
	add("{\"term\":\"arctostaphylos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12251548\"]}");
	add("{\"term\":\"arctotis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11945609\"]}");
	add("{\"term\":\"arcturus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09228222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }