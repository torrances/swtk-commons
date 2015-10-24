package org.swtk.commons.dict.wiktionary.generated.b.o.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBOZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bozon", "{\"term\":\"bozon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|bozo|boson|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A notional particle of stupidity\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1996\u0027\u0027, \u0026quot;John Novak\u0026quot;, \u0027Re: TOR is Fucking with Us All\u0027 (on newsgroup \u0027rec.arts.sf.written.robert-jordan\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Chain book sellers are, by and large, bogon and \u0027\u0027bozon\u0027\u0027 emitters like nothing you\u0027ve ever seen\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, \u0026quot;Jeffrey Yu\u0026quot;, \u0027[Fanfic] Flame Wars!!!\u0027 (on newsgroup \u0027alt.startrek.vs.starwars\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"One \u0027\u0027bozon\u0027\u0027 is the exact amount of stupidity and lack of scientific knowledge needed to confuse joules with watts\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027, \u0026quot;Dirt First!\u0026quot;, \u0027Re: Thanks for all the fish, but I\u0027m vegetarian\u0027 (on newsgroup \u0027comp.lang.perl.misc\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Riling people to the point of stupidity is a poor litmus test of their decency, no matter how red and blue their faces get. The result of these trolls seems only to show that the collision of large egos results in the ejection of energetic \u0027\u0027bozons\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, \u0026quot;Kurt[MCoPS]\u0026quot;, \u0027Re: [ot] Aiiieee! - The Four Horseman return!\u0027 (on newsgroup \u0027rec.games.miniatures.warhammer\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"There might be a superhigh concentration of \u0027\u0027bozons\u0027\u0027 which will create a Stupid Hole and suck them all in\", \"priority\":9}]}, \"synonyms\":{}}");

	add("bozophobia", "{\"term\":\"bozophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027{{w|Bozo the Clown|Bozo}}\u0027 (a famous American clown character) + \u0027-phobia\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fear of clowns\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1978\u0027\u0027, Jane Stern \u0026amp; Michael Stern, \u0027Amazing America: A Guide to Over 600 Sights\u0027, Random House (1978), ISBN 9780394734101, [http://books.google.ca/books?id\u003dLP51AAAAMAAJ\u0026amp;q\u003d%22bozophobia%22 page 156\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Do not go to the Ringling Museum of the Circus if you suffer from \u0027\u0027bozophobia\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1995\u0027\u0027, \u0027Maximum Rocknroll\u0027, Issue 148, [http://books.google.com/books?id\u003dv3JbAAAAMAAJ\u0026amp;q\u003d%22bozophobia%22\u0026amp;dq\u003d%22bozophobia%22 unknown page\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"I hate clowns, clowns suck, clowns are big, mean scary people, who deserve to get the crap beat out of them like no one else deserves to. (Except maybe mimes) \u0027\u0027Bozophobia\u0027\u0027 aside, I really like this: it\u0027s fast, it\u0027s well played\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }