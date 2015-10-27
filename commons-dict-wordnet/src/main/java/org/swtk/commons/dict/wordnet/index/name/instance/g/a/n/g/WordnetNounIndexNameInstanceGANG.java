package org.swtk.commons.dict.wordnet.index.name.instance.g.a.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGANG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gang\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03420273\", \"08259720\", \"08290764\", \"08260983\"]}");
	add("{\"term\":\"gangboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03420396\"]}");
	add("{\"term\":\"gangdom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08262093\"]}");
	add("{\"term\":\"ganger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139531\"]}");
	add("{\"term\":\"ganges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09309536\"]}");
	add("{\"term\":\"gangland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08262093\"]}");
	add("{\"term\":\"gangliocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05434923\"]}");
	add("{\"term\":\"ganglion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05304467\"]}");
	add("{\"term\":\"gangplank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03420396\"]}");
	add("{\"term\":\"gangrene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11507108\", \"14336867\"]}");
	add("{\"term\":\"gangsaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03420536\"]}");
	add("{\"term\":\"gangsta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139610\"]}");
	add("{\"term\":\"gangster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139742\"]}");
	add("{\"term\":\"gangway\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02696719\", \"03420396\", \"03420659\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }