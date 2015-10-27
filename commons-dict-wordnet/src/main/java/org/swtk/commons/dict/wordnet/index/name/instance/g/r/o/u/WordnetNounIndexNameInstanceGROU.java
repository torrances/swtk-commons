package org.swtk.commons.dict.wordnet.index.name.instance.g.r.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGROU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grouch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10167825\"]}");
	add("{\"term\":\"groucho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11180666\"]}");
	add("{\"term\":\"ground\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"03365691\", \"03467526\", \"03467679\", \"05939360\", \"09358146\", \"05942570\", \"08597662\", \"13813124\", \"14867162\", \"09201896\", \"09357302\"]}");
	add("{\"term\":\"groundball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00129909\"]}");
	add("{\"term\":\"groundberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12256282\", \"12274685\"]}");
	add("{\"term\":\"groundbreaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10454492\"]}");
	add("{\"term\":\"groundbreaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00240350\"]}");
	add("{\"term\":\"groundcover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13133055\", \"13133186\"]}");
	add("{\"term\":\"grounder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00129909\"]}");
	add("{\"term\":\"groundfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02515986\"]}");
	add("{\"term\":\"groundhog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02364239\"]}");
	add("{\"term\":\"grounding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00149656\", \"05995479\"]}");
	add("{\"term\":\"groundkeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10168183\"]}");
	add("{\"term\":\"groundlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05147351\"]}");
	add("{\"term\":\"groundling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10168062\"]}");
	add("{\"term\":\"groundmass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14915829\"]}");
	add("{\"term\":\"groundnut\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07753721\", \"07790008\", \"12527884\"]}");
	add("{\"term\":\"grounds\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09317890\", \"06753097\", \"08587931\", \"04618236\", \"05832256\"]}");
	add("{\"term\":\"groundsel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12033224\"]}");
	add("{\"term\":\"groundsheet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03468598\"]}");
	add("{\"term\":\"groundskeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10168183\"]}");
	add("{\"term\":\"groundsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10168183\"]}");
	add("{\"term\":\"groundspeed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15308893\"]}");
	add("{\"term\":\"groundwork\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01146093\", \"03391862\", \"05801562\"]}");
	add("{\"term\":\"group\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06026202\", \"14645624\", \"00031563\"]}");
	add("{\"term\":\"grouper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02571590\", \"07794200\"]}");
	add("{\"term\":\"groupie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10168511\"]}");
	add("{\"term\":\"grouping\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05741035\", \"01014302\", \"00031563\"]}");
	add("{\"term\":\"groupthink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05796929\"]}");
	add("{\"term\":\"groupware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06580136\"]}");
	add("{\"term\":\"grouse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01797729\", \"07662724\"]}");
	add("{\"term\":\"grouseberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12269639\"]}");
	add("{\"term\":\"grout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14916139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }