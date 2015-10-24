package org.swtk.commons.dict.wiktionary.generated.a.u.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAUC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("auction", "{\"term\":\"auction\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027lang\u003dla|augere\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A public event where goods or property are sold to the highest bidder\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.economist.com/news/books-and-arts/21606252-ideal-political-role-model-freedom-fighterfinance-and-economics/21606837-risks-cartels-and-collusion-pose-auctions-competition-hammered Competition, passage\u003d\u0027\u0027Auctions\u0027\u0027 come in a wide variety. In a “Dutch \u0027\u0027auction\u0027\u0027”, often used to sell flowers and fruit, prices start high and gradually drop until a bidder is willing to pay up. A “Japanese \u0027\u0027auction\u0027\u0027” is a bit like poker: bids rise with each round and anyone who wants to win must bid every time. Vendors using \u0027\u0027auctions\u0027\u0027 rid themselves of the headache of choosing prices and instead just pick the rules bidders must follow\", \"priority\":2}]}, \"synonyms\":{}}");

	add("auctioneer", "{\"term\":\"auctioneer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|auction|eer|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who conducts an auction on behalf of a vendor, taking bids to find the best price for the vendor\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }