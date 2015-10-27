package org.swtk.commons.dict.wordnet.index.name.instance.s.o.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"soap\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04260861\", \"13306124\", \"04260547\"]}");
	add("{\"term\":\"soapberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12761982\"]}");
	add("{\"term\":\"soapbox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03164306\", \"04261041\"]}");
	add("{\"term\":\"soapfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02573115\"]}");
	add("{\"term\":\"soapiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04955065\"]}");
	add("{\"term\":\"soaprock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15068894\"]}");
	add("{\"term\":\"soapstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15068894\"]}");
	add("{\"term\":\"soapsuds\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09462117\"]}");
	add("{\"term\":\"soapweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12503787\"]}");
	add("{\"term\":\"soapwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11835053\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }