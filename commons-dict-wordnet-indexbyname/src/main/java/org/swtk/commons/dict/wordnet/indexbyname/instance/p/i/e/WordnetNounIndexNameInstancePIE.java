package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06954856\", \"07641102\"]}");
	add("{\"term\":\"piece\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"03721866\", \"13307547\", \"15271164\", \"03844055\", \"05092096\", \"07670276\", \"03348699\", \"06280049\", \"07324075\", \"07051211\", \"09408804\", \"03938737\", \"03938441\"]}");
	add("{\"term\":\"piecework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00582554\"]}");
	add("{\"term\":\"piedmont\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08827601\", \"09414537\", \"09074556\"]}");
	add("{\"term\":\"piemonte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08827601\"]}");
	add("{\"term\":\"pieplant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07729012\"]}");
	add("{\"term\":\"pier\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03940209\", \"03940318\", \"03939805\"]}");
	add("{\"term\":\"pierce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11254803\"]}");
	add("{\"term\":\"pierid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02283110\"]}");
	add("{\"term\":\"pieridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282875\"]}");
	add("{\"term\":\"pieris\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02283497\", \"12263809\"]}");
	add("{\"term\":\"pierre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09162230\"]}");
	add("{\"term\":\"pierrot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09626294\"]}");
	add("{\"term\":\"pieta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03940932\"]}");
	add("{\"term\":\"pietism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04834406\", \"08492733\"]}");
	add("{\"term\":\"piety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04834002\"]}");
	add("{\"term\":\"piezoelectricity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11511708\"]}");
	add("{\"term\":\"piezometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03941166\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }