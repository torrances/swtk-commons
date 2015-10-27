package org.swtk.commons.dict.wordnet.index.name.instance.c.o.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cost\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05171334\", \"05152365\", \"13296870\"]}");
	add("{\"term\":\"costa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05286525\", \"05599881\"]}");
	add("{\"term\":\"costalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14353451\"]}");
	add("{\"term\":\"costanoan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06937337\", \"09673510\"]}");
	add("{\"term\":\"costermonger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09987658\"]}");
	add("{\"term\":\"costia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01422214\"]}");
	add("{\"term\":\"costiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14286242\"]}");
	add("{\"term\":\"costing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00620382\"]}");
	add("{\"term\":\"costliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05153519\"]}");
	add("{\"term\":\"costmary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07833575\", \"12041968\"]}");
	add("{\"term\":\"costochondritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365057\"]}");
	add("{\"term\":\"costs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13314648\"]}");
	add("{\"term\":\"costume\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03118486\", \"03118887\", \"03118692\", \"03118308\"]}");
	add("{\"term\":\"costumer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09987789\"]}");
	add("{\"term\":\"costumier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09987789\"]}");
	add("{\"term\":\"costusroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12030657\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }