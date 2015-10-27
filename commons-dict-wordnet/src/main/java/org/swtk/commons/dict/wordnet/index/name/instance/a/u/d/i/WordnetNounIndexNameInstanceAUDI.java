package org.swtk.commons.dict.wordnet.index.name.instance.a.u.d.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUDI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"audibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05026100\"]}");
	add("{\"term\":\"audible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00189032\"]}");
	add("{\"term\":\"audibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05026100\"]}");
	add("{\"term\":\"audience\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07158332\", \"14508362\", \"08239214\", \"08238818\"]}");
	add("{\"term\":\"audile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10185266\"]}");
	add("{\"term\":\"audio\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02759756\", \"04269788\", \"05063537\", \"06288789\"]}");
	add("{\"term\":\"audiocassette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02759982\"]}");
	add("{\"term\":\"audiogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02760216\"]}");
	add("{\"term\":\"audiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06070282\"]}");
	add("{\"term\":\"audiometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02760342\"]}");
	add("{\"term\":\"audiometry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01000924\", \"06070282\"]}");
	add("{\"term\":\"audiotape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02760719\", \"02760815\"]}");
	add("{\"term\":\"audiovisual\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02760932\"]}");
	add("{\"term\":\"audit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00141996\", \"13432330\"]}");
	add("{\"term\":\"audition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00796275\", \"05665563\"]}");
	add("{\"term\":\"auditor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09842357\", \"09842555\", \"10185041\"]}");
	add("{\"term\":\"auditorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02761139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }